"use client";

import { Bar } from "react-chartjs-2";

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

export default function BarChart({ chartData, title }: { chartData: any, title: string }) {
  return (
      <div>
        <p className="text-lg font-medium mb-2 text-center">{title}</p>
        <Bar data={chartData} options={options} />
    </div>
  )

}
