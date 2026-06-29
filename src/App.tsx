import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Dashboard } from './pages/Dashboard';

// TODO: The NullPointerException is in the authentication service, not this UI repository.
// The fix needs to be applied to the authentication service repository.

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
