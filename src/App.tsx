import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Dashboard } from './pages/Dashboard';



function App() {
  // TODO: Investigate and fix memory leak related to KAN-14. 
  // This is a placeholder for the fix. Further analysis is needed to identify the root cause.
  return (
    <Router basename='/'>
      <Routes>
        <Route path="/" element={<Dashboard />} />
      </Routes>
    </Router>
  );
}

export default App

