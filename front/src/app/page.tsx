import { getData } from "./_api/paths/paths";

export default async function Home() {
  const data = await getData();
  console.log("data", data);
  return (
    <div>
      {data.data.map((item, idx) => {
        return <div key={idx}>{item.value}</div>;
      })}
      <h1 className="text-xl">Welcome to our first project</h1>
      <h2>Welcome to our first project</h2>
      <p>안녕하세요 템플릿 테스트 입니다. 테일윈드 잘 드가는구먼</p>
    </div>
  );
}
