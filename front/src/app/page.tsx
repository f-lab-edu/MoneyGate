import { getData } from "./_api/paths/paths";
import { Line } from "react-chartjs-2";
import dynamic from "next/dynamic";

// Dynamically import the Chart component to avoid server-side rendering
const Chart = dynamic(() => import("./_components/Chart"), { ssr: false });

export default async function Home() {
  const data = await getData();
  console.log("data", data);

  const chartData = {
    labels: ["2024-01", "2024-02", "2024-03"],
    datasets: [
      {
        label: "Dataset 1",
        data: [5, 6, 7],
        borderColor: "red",
        backgroundColor: "red",
      },
      {
        label: 'Dataset 2',
        data: [3, 2, 1],
        borderColor: "blue",
        backgroundColor: "blue",
      },
    ],
  };

  return (
    <div>
      <Chart chartData={chartData} />
      {data.data.map((item, idx) => {
        return <div key={idx}>{item.value}</div>;
      })}
      <h1 className="text-xl">Welcome to our first project</h1>
      <h2>Welcome to our first project</h2>
      <p>안녕하세요 템플릿 테스트 입니다. 테일윈드 잘 드가는구먼</p>
    </div>
  );
}
