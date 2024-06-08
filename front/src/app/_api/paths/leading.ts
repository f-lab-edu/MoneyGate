import { Response } from "../types/types";

const REQUEST_HOST = "http://foodiy.iptime.org:39908";

// 고용비용지수
export async function getEmploymentCostIndex() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/employment-cost-index`
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

// 소비자물가지수
export async function getCpi() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/cpi`
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

// 핵심 소비자물가지수
export async function getCoreCpi() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/core-ppi`
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

// 생산자물가지수
export async function getCorePpi() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/core-ppi`
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

// 평균 시간당 수입
export async function getAverageHourlyEarning() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/average-hourly-earnings`
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
