import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Dashboard } from './pages/Dashboard';



function App() {
  return (
    <Router basename='/'>
      <Routes>
        <Route path="/" element={<Dashboard />} />
      </Routes>
    </Router>
  );
}

export default App

// TODO: The Java backend files (AuthController.java, LoginFilter.java) related to SAM1-180 were not found in this repository (pvaranasi-winfo/disc-ui).
// This PR is a placeholder to acknowledge the issue and will be updated once the correct repository is identified.
