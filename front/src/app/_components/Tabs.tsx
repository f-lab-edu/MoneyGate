"use client";

import { useState } from "react";

export default function Tabs({ children }: { children: React.ReactNode[] }) {
  const [activeTab, setActiveTab] = useState<"LEADING" | "INFLATION">(
    "LEADING"
  );

  const handleTabClick = (tab: "LEADING" | "INFLATION") => {
    setActiveTab(tab);
  };

  return (
    <div className="w-auto">
      <div className="relative right-0">
        <ul
          className="relative flex flex-wrap p-1 list-none rounded-xl bg-blue-gray-50/60"
          data-tabs="tabs"
          role="list"
        >
          <li className="z-30 flex-auto text-center">
            <a
              className={`z-30 flex items-center justify-center w-full px-0 py-1 mb-0 transition-all ease-in-out border-0 rounded-lg cursor-pointer text-slate-700 ${
                activeTab === "LEADING"
                  ? "bg-indigo-500 text-white"
                  : "bg-inherit"
              }`}
              onClick={() => handleTabClick("LEADING")}
              role="tab"
              aria-selected={activeTab === "LEADING"}
              aria-controls="LEADING"
            >
              <span className="ml-1">선행지표</span>
            </a>
          </li>
          <li className="z-30 flex-auto text-center">
            <a
              className={`z-30 flex items-center justify-center w-full px-0 py-1 mb-0 transition-all ease-in-out border-0 rounded-lg cursor-pointer text-slate-700 ${
                activeTab === "INFLATION"
                  ? "bg-indigo-500 text-white"
                  : "bg-inherit"
              }`}
              onClick={() => handleTabClick("INFLATION")}
              role="tab"
              aria-selected={activeTab === "INFLATION"}
              aria-controls="INFLATION"
            >
              <span className="ml-1">인플레이션 지표</span>
            </a>
          </li>
        </ul>
        <div data-tab-content={activeTab} className="mt-5">
          {activeTab === "LEADING" && (
            <div className="block opacity-100" id="leading" role="tabpanel">
              {children[0]}
            </div>
          )}
          {activeTab === "INFLATION" && (
            <div className="block opacity-100" id="inflation" role="tabpanel">
              {children[1]}
            </div>
          )}
        </div>
      </div>
    </div>
  );
}
