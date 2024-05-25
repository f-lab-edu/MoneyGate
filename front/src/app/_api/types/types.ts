export type Data = {
  value: number;
  percent: number;
}

export type Attr = {
  timestamp: Date;
  actualState: null;
  actual: number;
  actualFormatted: null;
  forecast: number;
  forecastFormatted: null;
  revised: number;
  revisedFormatted: null;
}

export type Response = {
  data: Array<Data>
  attr: Array<Attr>
}