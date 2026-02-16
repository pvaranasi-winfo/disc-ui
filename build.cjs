const fs = require('fs');
const path = require('path');

// Get the mode from command line args or env
const mode = process.env.NODE_ENV || 'development';

const templateDir = path.join(__dirname, 'build-templates', mode);
const publicWebInfDir = path.join(__dirname, 'public', 'WEB-INF');

// Check if template exists
if (fs.existsSync(templateDir)) {
  // Copy WEB-INF from template to public
  const templateWebInf = path.join(templateDir, 'WEB-INF');
  if (fs.existsSync(templateWebInf)) {
    // Remove existing
    if (fs.existsSync(publicWebInfDir)) {
      fs.rmSync(publicWebInfDir, { recursive: true });
    }
    // Copy
    fs.cpSync(templateWebInf, publicWebInfDir, { recursive: true });
    console.log(`Copied WEB-INF from ${templateWebInf} to ${publicWebInfDir}`);
  }
}