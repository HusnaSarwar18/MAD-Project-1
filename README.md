README - PakWheels App
Project Overview
This Android application, named PakWheels, is designed to facilitate the buying and selling of used cars. It includes several key features like browsing cars, user authentication via OTP, and managing profiles. The app provides a clean and user-friendly interface for car sellers and buyers.

Pages Overview:
Browse Page (browse_page.xml)

Displays categories, budget options, and brand filters for browsing used cars.
Contains a search bar for car listings.
Three filter buttons: Category, Budget, and Brand.
Login Page (login_page.xml)

Provides various options for users to log in via phone number, Google, Facebook, or email.
Includes input for phone number and buttons to continue with different login methods.
OTP Verification Page (otp_page.xml)

Displays six input fields for entering the OTP (One-Time Password) for verification.
Includes a button to verify the OTP and an option to resend it.
Profile Page (profile_page.xml)

Allows the user to view their profile, including their username and email.
Options are provided to edit the profile and log out.
Sell Now Page (sellnow_page.xml)

Users can input their car's brand, model, and price to sell the car.
A button labeled Sell Now is provided for submitting the information.
Splash Screen (splash_page.xml)

A splash screen with a blue background and the app's logo, which is shown when the app is launched.
Features:
User Authentication: The app supports login via mobile number, Google, Facebook, or email. OTP verification ensures secure access to the user account.
Car Listing & Browsing: The browse page provides options to filter cars by category, budget, and brand.
Selling Cars: Users can input details of their car and list it for sale.
Profile Management: Users can view and edit their profile or log out of the application.
Files Structure:
XML Layouts:
browse_page.xml: Layout for browsing used cars.
login_page.xml: Layout for user login.
otp_page.xml: Layout for OTP input and verification.
profile_page.xml: Layout for user profile management.
sellnow_page.xml: Layout for car selling form.
splash_page.xml: Layout for splash screen on app startup.
Future Enhancements:
Car Listings Integration: Add a RecyclerView or ListView for displaying car listings.
Search Functionality: Implement search logic to filter cars based on the user’s input.
Backend Integration: Connect to a database for storing user data, car listings, and transactions.
