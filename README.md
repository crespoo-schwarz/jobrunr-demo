# Setup:

1 - Create a postgres db:
```docker run --name pac-db -e POSTGRES_PASSWORD=db_password -e POSTGRES_USER=db_user -p 5432:5432 -d --restart=always postgres```

2 - configure the password for jobrunr PRO in the build.gradle file

3 - Run the application. Navigate to http://localhost:8080/swagger-ui/index.html#/product-controller/getProductById

4 - The application will schedule a job that will fail with the following error:

failed to lazily initialize a collection of role: com.example.demo.Product.images: could not initialize proxy - no Session