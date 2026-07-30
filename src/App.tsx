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
// TODO: The actual fix for SAM1-180 (NullPointerException in Auth service) needs to be applied in the backend authentication service repository, as the relevant Java files (AuthController.java, LoginFilter.java) were not found in this repository (disc-ui).
