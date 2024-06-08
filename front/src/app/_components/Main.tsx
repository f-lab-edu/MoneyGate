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
} from "../_api/paths/paths";
import dynamic from "next/dynamic";
import Table from "./Table";
import Tabs from "./Tabs";

const Chart = dynamic(() => import("./Chart"), { ssr: false });

export default async function Main() {
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
    <div className="grid gap-4">
      <div className="inline-flex rounded-md shadow-sm" role="group">
        <button
          type="button"
          className="px-4 py-2 text-sm font-medium text-gray-900 bg-white border border-gray-200 rounded-s-lg hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-2 focus:ring-blue-700 focus:text-blue-700 dark:bg-gray-800 dark:border-gray-700 dark:text-white dark:hover:text-white dark:hover:bg-gray-700 dark:focus:ring-blue-500 dark:focus:text-white"
        >
          Profile
        </button>
        <button
          type="button"
          className="px-4 py-2 text-sm font-medium text-gray-900 bg-white border-t border-b border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-2 focus:ring-blue-700 focus:text-blue-700 dark:bg-gray-800 dark:border-gray-700 dark:text-white dark:hover:text-white dark:hover:bg-gray-700 dark:focus:ring-blue-500 dark:focus:text-white"
        >
          Settings
        </button>
        <button
          type="button"
          className="px-4 py-2 text-sm font-medium text-gray-900 bg-white border border-gray-200 rounded-e-lg hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-2 focus:ring-blue-700 focus:text-blue-700 dark:bg-gray-800 dark:border-gray-700 dark:text-white dark:hover:text-white dark:hover:bg-gray-700 dark:focus:ring-blue-500 dark:focus:text-white"
        >
          Messages
        </button>
      </div>
      <Tabs>
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
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-4">
          {/* <Table title="소매판매지수" attr={retailSalesData.attr} /> */}
        </div>
      </Tabs>
    </div>
  );
}
