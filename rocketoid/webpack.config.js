const path = require('path');

module.exports = {
  entry: './resources/js/main.js',
  output: {
    filename: 'main.js',
    path: path.resolve(__dirname, './resources/public/js'),
  },
};