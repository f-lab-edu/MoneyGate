import {
  getRetailSales,
  getpriceIndex,
  getPersonalIncome,
  getNewHomeSales,
  getManufacturingPmi,
  getIsmManufacturingPmi,
  getExistingHomeSales,
  getCbConsumer,
  getAllCarSales,
} from "../_api/paths/inflation";
import { getAverageHourlyEarning } from "../_api/paths/leading";

import dynamic from "next/dynamic";
import Table from "./Table";
import Tabs from "./Tabs";
import Period from "./Period";
import { PeriodProvider, usePeriod } from "./PeriodContext";

const Chart = dynamic(() => import("./Chart"), { ssr: false });

const period = [
  { label: "6개월" },
  { label: "1년" },
  { label: "2년" },
  { label: "3년" },
];

export default async function Main() {
  // leading
  const averageHourEarning = await getAverageHourlyEarning();

  // infalation
  const retailSalesData = await getRetailSales();
  const priceIndexData = await getpriceIndex();
  const manufacturingPmiData = await getManufacturingPmi();
  // const ismManufacuringPmiData = await getIsmManufacturingPmi();
  // const personalIncomeData = await getPersonalIncome();
  // const newHomeSalesData = await getNewHomeSales();
  // const existingHomeSalesData = await getExistingHomeSales();
  // const cbConsumerData = await getCbConsumer();
  // const allCarSalesData = await getAllCarSales();

  return (
    <PeriodProvider>
      <div className="grid gap-4">
        <Period />
        <Tabs>
          <div className="grid grid-cols-1 lg:grid-cols-2 gap-x-4 gap-y-20">
            <Table
              title="미국 평균 시간당 수입"
              attr={averageHourEarning.attr}
            />
          </div>
          <div className="grid grid-cols-1 lg:grid-cols-2 gap-x-4 gap-y-20">
            <Table title="소매판매지수" attr={retailSalesData.attr} />
            <Table title="개인소비지출 물가지수" attr={priceIndexData.attr} />
            <Table title="미국 제조업 PMI" attr={manufacturingPmiData.attr} />
            {/* <Table
            title="미국 기존 주택 판매"
            attr={existingHomeSalesData.attr}
          />
          <Table
            title="소비자 신뢰 지수"
            attr={cbConsumerData.attr}
          />
          <Table
            title="미국 모든 자동차 판매"
            attr={allCarSalesData.attr}
          /> */}
          </div>
        </Tabs>
      </div> 
    </PeriodProvider>
  );
}
