"use client";

import { useQuery } from "@tanstack/react-query";
import { getData } from "../_api/paths/paths";

async function getUsers() {
  return await fetch("https://jsonplaceholder.typicode.com/users").then((res) =>
    res.json()
  );
}

export default function Footer() {
  const currentYear = new Date().getFullYear();
  const { data } = useQuery({
    queryKey: ["stream-hydrate-users"],
    queryFn: () => getUsers(),
  });
  // console.log(data);
  return (
    <footer className="bg-white rounded-lg m-4 dark:bg-gray-800 mt-auto">
      <div className="w-full mx-auto max-w-screen-xl p-4 md:flex md:items-center md:justify-between">
        <span className="text-sm text-gray-500 sm:text-center dark:text-gray-400">
          © {currentYear}{" "}
          <a href="https://naver.com/" className="hover:underline">
            MONEYGATE™
          </a>
          . All Rights Reserved.
        </span>
        <ul className="flex flex-wrap items-center mt-3 text-sm font-medium text-gray-500 dark:text-gray-400 sm:mt-0">
          <li>
            <a href="#" className="hover:underline me-4 md:me-6">
              About us
            </a>
          </li>
          <li>
            <a href="#" className="hover:underline me-4 md:me-6">
              Privacy Policy
            </a>
          </li>
          <li>
            <a href="#" className="hover:underline">
              Contact
            </a>
          </li>
        </ul>
      </div>
    </footer>
  );
}
