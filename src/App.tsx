import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.tsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
      {/* TODO: SAM1-164 - Investigate and fix date formatting for sales reports.
          The monthly sales report is showing dates as MM/DD/YYYY instead of DD/MM/YYYY.
          This likely requires changes in the backend reporting service, possibly in a file like ReportFormatter.java.
          The suggested fix is to change DateTimeFormatter.ofPattern('MM/dd/yyyy') to
          DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).
          This change needs to be applied in the correct repository/service.
      */}
    </>
  )
}

export default App
