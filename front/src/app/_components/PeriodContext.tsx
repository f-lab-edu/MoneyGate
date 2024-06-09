"use client";

import {
  createContext,
  useContext,
  useState,
  ReactNode,
  Dispatch,
  SetStateAction,
} from "react";


interface PeriodContextType {
  period: string;
  setPeriod: Dispatch<SetStateAction<string>>;
}

const PeriodContext = createContext<PeriodContextType | undefined>(undefined);

export const usePeriod = (): PeriodContextType => {
  const context = useContext(PeriodContext);
  
  if (!context) {
    throw new Error("usePeriod must be used within a PeriodProvider");
  }
  return context;
};

interface PeriodProviderProps {
  children: ReactNode;
}

export const PeriodProvider = ({ children }: PeriodProviderProps) => {
  const [period, setPeriod] = useState("6개월");

  return (
    <PeriodContext.Provider value={{ period, setPeriod }}>
      {children}
    </PeriodContext.Provider>
  );
};