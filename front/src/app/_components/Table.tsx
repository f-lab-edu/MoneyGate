import { Attr } from "../_api/types/types";
import { formatDate } from "../_util/util";

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
                  {key === "timestamp" ? formatDate(item[key]) : item[key]}
                </td>
              )
          )}
        </tr>
      ))}
    </tbody>
  );
};

export default function Table({ title, attr }: { title: string; attr: Attr[] }) {
  return (
    <div className="relative overflow-x-auto w-full flex flex-col">
      <p className="text-lg font-medium mb-2 text-center">{title}</p>
      <table>
        <TableHead data={attr} />
        <TableBody data={attr} />
      </table>
    </div>
  );
}
