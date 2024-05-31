import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";
import Header from "./_components/Header";
import Footer from "./_components/Footer";
import Providers from "./_provider/ReactQueryProvider";

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Economic Indicators",
  description: "this is economic indicator web service",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className={`${inter.className} flex flex-col relative`}>
        <Providers>
          <Header />
          <main className="flex-grow max-w-7xl mx-auto w-full p-6 lg:px-8">
            <div className="w-full mx-auto">{children}</div>
          </main>
          <Footer />
        </Providers>
      </body>
    </html>
  );
}
