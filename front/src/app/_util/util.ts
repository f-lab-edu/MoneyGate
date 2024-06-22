import {
  format as fnsFormat,
  formatDuration as fnsFormatDuration,
  Locale,
} from 'date-fns';
import { ko } from 'date-fns/locale';

export * from 'date-fns';
export * as DateTimeZone from 'date-fns-tz';
export * as duration from 'duration-fns';

type foramtOptions = {
  locale?: Locale;
  weekStartsOn?: 0 | 1 | 2 | 3 | 4 | 5 | 6;
  firstWeekContainsDate?: number;
  useAdditionalWeekYearTokens?: boolean;
  useAdditionalDayOfYearTokens?: boolean;
};

function defaultLocalOption(options?: { locale?: Locale }) {
  return { ...options, locale: options?.locale ?? ko };
}

export function format(
  date: number | Date,
  format = 'yyyy.MM.dd',
  options?: foramtOptions
) {
  return fnsFormat(date, format, defaultLocalOption(options));
}

export function formatDateWithMonth(dateString: string) {
  const date = new Date(dateString);
  const year = date.getFullYear();
  const month = date.getMonth() + 1;
  const day = date.getDate();
  const monthNames = ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"];
  const monthName = monthNames[month - 1]; 
  return `${year}년 ${month}월 ${day}일 (${monthName})`;
}

export function formatDate(dateString: string) {
  const date = new Date(dateString);
  const year = date.getFullYear();
  const month = date.getMonth() + 1;
  const day = date.getDate();
  const monthNames = ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"];
  const monthName = monthNames[month - 1];
  return `${year}/${month}/${day}`;
}