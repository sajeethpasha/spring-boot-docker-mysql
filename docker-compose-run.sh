# Step 1: Clean up
docker-compose down
docker system prune -a

# Step 2: Build and start
docker-compose up --build

# Step 3: Check logs and status if errors occur
docker-compose logs
docker-compose ps
