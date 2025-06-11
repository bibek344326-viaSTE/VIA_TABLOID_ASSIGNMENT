# Step 1: Use Node.js image to build the app
FROM node:16 AS build

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

# Fix permissions for react-scripts
RUN chmod -R +x ./node_modules/.bin

RUN npm run build

# Step 2: Serve the React app using an Nginx server
FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
