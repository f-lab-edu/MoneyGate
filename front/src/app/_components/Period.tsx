"use client";

import { useState } from 'react';


import { usePeriod } from "./PeriodContext";

const periodOptions = [
  { label: "6개월" },
  { label: "1년" },
  { label: "2년" },
  { label: "3년" },
];

export default function Period() {
  const { period, setPeriod } = usePeriod();
  return (
    <div className="inline-flex rounded-md" role="group">
      {periodOptions.map((item, index) => {
        const isFirst = index === 0;
        const isLast = index === periodOptions.length - 1;

        let buttonClasses =
          "px-4 py-2 text-sm font-medium text-gray-900 border border-gray-200";

        if (isFirst) {
          buttonClasses += " rounded-l-lg";
        } else if (isLast) {
          buttonClasses += " rounded-r-lg";
        } else {
          buttonClasses += " -ml-px";
        }
        if (period === item.label) {
          buttonClasses += " bg-blue-500 text-white border-blue-500";
        }

        return (
          <button
            key={index}
            type="button"
            className={buttonClasses}
            onClick={() => setPeriod(item.label)}
          >
            {item.label}
          </button>
        );
      })}
    </div>
  );
}