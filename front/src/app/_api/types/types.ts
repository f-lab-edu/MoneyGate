export type Data = {
  value: number;
  percent: number;
}

export type Attr = {
  timestamp: string;
  actualState: number | null;
  actual: number | null;
  actualFormatted: number | null;
  forecast: number | null;
  forecastFormatted: number | null;
  revised: number | null;
  revisedFormatted: number | null;
  [key: string]: string | number | null;
}

export type Response = {
  data: Array<Data>
  attr: Array<Attr>
}
