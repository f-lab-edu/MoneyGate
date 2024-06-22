"use client";

import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  LineElement,
  BarElement,
  PointElement,
  Title,
  Tooltip,
  Legend,
} from "chart.js";

import { Line } from "react-chartjs-2";

ChartJS.register(
  CategoryScale,
  LinearScale,
  BarElement,
  LineElement,
  PointElement,
  Title,
  Tooltip,
  Legend
);

const options = {
  elements: {
    bar: {
      borderWidth: 2,
    },
  },
  responsive: true,
  plugins: {
    legend: {
      display: true,
    },
  },
};

export default function LineChart({
  chartData,
  title,
}: {
  chartData: any;
  title: string;
}) {
  return (
    <div>
      <p className="text-lg font-medium mb-2 text-center">{title}</p>
      <Line datasetIdKey="id" data={chartData} options={options} />
    </div>
  )
}
