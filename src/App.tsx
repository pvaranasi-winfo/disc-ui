import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Dashboard } from './pages/Dashboard';

// TODO: The authentication service (a separate microservice) is throwing a NullPointerException.
// The fix needs to be applied in the authentication service repository, not in this UI repository.
// This placeholder PR is to acknowledge the issue and track the fix.

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
