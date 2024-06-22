"use client";

import { Attr, Data } from "../_api/types/types";
import { formatDateWithMonth, formatDate } from "../_util/util";
import { useState } from "react";
import LineChart from "./Chart/LineChart";
import BarChart from "./Chart/BarChart";
import { usePeriod } from "./PeriodContext";

const TableHead = ({ data }: { data: Attr[] }) => {
  const columnHeaderMapping: { [key: string]: string | null } = {
    timestamp: "발표 날짜",
    actual: "실제",
    actualState: null,
    actualFormatted: null,
    forecast: "예측",
    forecastFormatted: null,
    revised: "이전",
    revisedFormatted: null,
  };

  const keys = Object.keys(data[0]);

  return (
    <thead className="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
      <tr>
        {keys.map((key, index) => {
          const label = columnHeaderMapping[key.toLowerCase()];
          return label ? (
            <th key={index} scope="col" className="px-1 md:px-6 py-3 text-left">
              {label}
            </th>
          ) : null;
        })}
      </tr>
    </thead>
  );
};

const TableBody = ({ data }: { data: Attr[] }) => {
  return (
    <tbody>
      {data.map((item, rowIndex) => (
        <tr
          key={rowIndex}
          className="bg-white border-b dark:bg-gray-800 dark:border-gray-700"
        >
          {Object.keys(item).map(
            (key, colIndex) =>
              item[key] !== null && (
                <td key={colIndex} className="px-1 md:px-6 py-4">
                  {key === "timestamp"
                    ? formatDateWithMonth(item[key])
                    : item[key]}
                </td>
              )
          )}
        </tr>
      ))}
    </tbody>
  );
};

export default function Table({
  title,
  data,
  attr,
}: {
  title: string;
  data?: Data[];
  attr: Attr[];
}) {
  const [showTable, setShowTable] = useState(true);

  const { period } = usePeriod();

  const periodLength =
    period === "6개월" ? 6 : period === "1년" ? 12 : period === "2년" ? 24 : 36;

  const dataSet = attr.slice(-periodLength).reverse();

  const date = attr
    .slice(-periodLength)
    .map((item) => formatDate(item.timestamp));
  const actual = attr.slice(-periodLength).map((item) => item.actual);
  const expected = attr.slice(-periodLength).map((item) => item.forecast);

  const chartData = {
    labels: [...date],
    datasets: [
      {
        label: "실제",
        data: [...actual],
        borderColor: "rgb(99 102 241)",
        backgroundColor: "rgb(99 102 241)",
      },
      {
        label: "예측",
        data: [...expected],
        borderColor: "red",
        backgroundColor: "red",
      },
    ],
  };

  const onHandleSwitch = () => {
    setShowTable((prev) => !prev);
  };

  if (!showTable) {
    return (
      <div className="relative overflow-x-auto w-full flex flex-col">
        <button
          className="w-32 bg-gray-500 hover:bg-gray-700 text-white font-bold py-1 px-2 rounded mb-2"
          onClick={onHandleSwitch}
        >
          {showTable ? "차트 보기" : "테이블 보기"}
        </button>
        {dataSet.length === 6 ? (
          <BarChart chartData={chartData} title={title} />
        ) : (
          <LineChart chartData={chartData} title={title} />
        )}
      </div>
    );
  }

  return (
    <div className="relative overflow-x-auto w-full flex flex-col max-h-[460px] overflow-y-scroll">
      <button
        className="w-32 bg-gray-500 hover:bg-gray-700 text-white font-bold py-1 px-2 rounded mb-2"
        onClick={onHandleSwitch}
      >
        {showTable ? "차트 보기" : "테이블 보기"}
      </button>
      <p className="text-lg font-medium mb-2 text-center">{title}</p>
      <table>
        <TableHead data={dataSet} />
        <TableBody data={dataSet} />
      </table>
    </div>
  );
}
