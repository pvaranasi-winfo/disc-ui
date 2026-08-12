import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Dashboard } from './pages/Dashboard';



function App() {
  // TODO: Investigate potential memory leaks in this component or its children based on JIRA KAN-14.
  // This is a placeholder comment as the specific cause of the memory leak is not identified yet.
  return (
    <Router basename='/'>
      <Routes>
        <Route path="/" element={<Dashboard />} />
      </Routes>
    </Router>
  );
}

export default App

