import { Response } from "../types/types";

const REQUEST_HOST = "http://foodiy.iptime.org:39908";

export async function getData() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/retail-sales`
  );

  if (!response.ok) {
    throw new Error("Network response was not ok");
  }
  const data: Response = await response.json();
  const trimmedData = {
    data: data.data.slice(-5).reverse(),
    attr: data.attr.slice(-5).reverse()
  }
  return trimmedData;
}