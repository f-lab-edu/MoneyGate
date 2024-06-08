export type Data = {
  value: number;
  percent: number;
}

export type Attr = {
  timestamp: string;
  actualState: string | null;
  actual: number | null;
  actualFormatted: string | null;
  forecast: number | null;
  forecastFormatted: string | null;
  revised: number | null;
  revisedFormatted: string | null;
  [key: string]: string | number | null;
}

export type Response = {
  data: Array<Data>
  attr: Array<Attr>
}
