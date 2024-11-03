# 🥗 Caloriapp - Twój Codzienny Kalkulator Kalorii 🥗

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-green?logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange?logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-lightgrey?logo=hibernate)
![JSP](https://img.shields.io/badge/JSP-Supported-brightgreen?logo=java)
![Apache Maven](https://img.shields.io/badge/Maven-Build-blue?logo=apachemaven)

Caloriapp to internetowa aplikacja stworzona dla osób, które chcą łatwo monitorować swoje codzienne spożycie kalorii. Dzięki przyjaznemu interfejsowi użytkownika oraz funkcjonalnościom dostępnym zarówno dla klientów, jak i administratorów, pozwala ona śledzić posiłki, zarządzać produktami i analizować wartość odżywczą spożywanych posiłków.

---

## 🌟 Funkcje aplikacji

### 👤 Strona Klienta
- **Dodawanie posiłków:** Możliwość dodania produktów do dziennika, z określeniem daty, wagi oraz ilości spożytej żywności.
- **Monitorowanie spożycia kalorii:** Automatyczne obliczanie kaloryczności wprowadzonej żywności.
- **Interaktywność:** Logowanie i rejestracja dla użytkowników, a także możliwość przeglądania posiłków z historii.

### 🔐 Strona Administratora
- **Zarządzanie produktami:** Administratorzy mogą dodawać, edytować oraz usuwać produkty z bazy danych.
- **Lista produktów i kalorii:** Widok listy wszystkich dostępnych produktów wraz z ich wartościami odżywczymi.

---

## 🔧 Technologie

- **Backend:** Java 17, Spring Boot
- **Baza danych:** MySQL + Hibernate ORM
- **Frontend:** JSP, HTML, CSS, JavaScript
- **Zarządzanie zależnościami:** Apache Maven
- **Autoryzacja i Autentykacja:** Spring Security dla ochrony zasobów i dostępu użytkowników

---

## ⚙️ Jak uruchomić projekt

1. **Klonowanie repozytorium:**
   ```bash
   git clone https://github.com/jacko-ski/Caloriapp.git
   cd Caloriapp
   ```
2. **Konfiguracja bazy danych:**

- Utwórz bazę danych w MySQL.
- Skonfiguruj plik `application.properties`, aby zawierał właściwe dane dostępu do bazy danych.

  ```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/nazwa_bazy_danych
  spring.datasource.username=użytkownik
  spring.datasource.password=hasło
  spring.jpa.hibernate.ddl-auto=update
  ```


3. **Uruchomienie aplikacji:**

- Uruchom komendę: `mvn spring-boot:run`

4. **Dostęp do aplikacji:**

- Otwórz przeglądarkę i przejdź do http://localhost:8080.

---

## 📝 Przykładowe ekrany
- **Home Page:** Powitanie z podstawowymi informacjami o aplikacji i linkami do logowania/rejestracji.
- **Strona użytkownika:** Dodawanie posiłków, wyświetlanie historii posiłków.
- **Panel administratora:** Zarządzanie listą produktów oraz ich kalorycznością.

---

## 🛠️ Współtwórcy
Projekt został stworzony i jest rozwijany przez Jacka Podgórni. Jeśli masz pytania lub sugestie, proszę o kontakt lub otworzenie zgłoszenia w sekcji Issues.

---

## 📜 Licencja
Projekt dostępny na licencji MIT.

---

Dziękuję za odwiedzenie repozytorium! Jeśli aplikacja Ci się podoba, daj ⭐ i zostaw komentarz.
