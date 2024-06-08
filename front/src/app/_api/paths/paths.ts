import { Response } from "../types/types";

const REQUEST_HOST = "http://foodiy.iptime.org:39908";

// 소매판매지수
export async function getRetailSales() {
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

// 개인소비지출 물가지수
export async function getpriceIndex() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/pce-price-index`
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


// 개인 소득
export async function getPersonalIncome() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/personal-income`
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

// 미국 신규 주택 판매
export async function getNewHomeSales() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/new-home-sales`
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

//미국 제조업 PMI
export async function getManufacturingPmi() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/manufacturing-pmi`
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

//미국 ISM 제조업 PMI
export async function getIsmManufacturingPmi() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/ism-manufacturing-pmi`
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

//미국 기존 주택 판매
export async function getExistingHomeSales() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/existing-home-sales`
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

// 미국 소비자 신뢰 지수
export async function getCbConsumer() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/cb-consumer`
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

// 미국 모든 자동차 판매
export async function getAllCarSales() {
  const response = await fetch(
    `${REQUEST_HOST}/chart/all-car-sales`
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