# 📚 I❤️TruyenServer

A full-featured manga/comic backend server built with **Java Spring Boot** and **MySQL**. Designed for scalability, extensibility, and seamless integration with frontend applications (mobile or web).

---

## 🚀 Features

### 🧩 Core Services
- **Category Service**: List and search comics by categories.
- **Comic Service**: Manage comic metadata (title, author, cover, views).
- **Comic Detail Service**: Retrieve comic descriptions, total chapters, etc.
- **Chapter Service**: List chapters of a comic in order, with each chapter containing multiple images.
- **Comment Service**: Add and view comments for each comic.
- **User Service**: Handle user registration, login

### 👥 User Features
- ✅ **Login/Register**: Access personalized content.
- 🔍 **Search by Category**: Explore comics by genre or type.
- 📖 **View Comic Details**: See title, description, category, author, and stats.
- 💬 **View Comments**: Read user-submitted thoughts on each comic.
- 📑 **View Chapter List**: Browse all chapters in ascending order.
- 🖼️ **Read Chapter**: Access ordered image URLs for a seamless reading experience.

---

## 🛠️ Tech Stack

| Layer       | Technology                           |
|-------------|--------------------------------------|
| Backend     | Spring Boot, Spring Web, Spring Data JPA |
| Database    | MySQL                               |
| Build Tool  | Maven                               |

---



## 📂 Project Structure

```
src/
├── controller/    # REST controllers
├── service/       # Business logic
├── repository/    # JPA repositories
├── entity/        # JPA entities (User, Comic, Chapter, Comment, etc.)
├── dto/           # Data Transfer Objects
└── config/        # Security and application configuration
```

---

## 🧪 Running Locally

### 1. Prerequisites
- JDK 17+
- Maven 3.8+
- MySQL 8.x


---

## 📄 License
This project is licensed under the [MIT License](LICENSE).
