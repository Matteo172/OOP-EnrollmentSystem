# OOP-Enrollment-System

---
**Author**: John Matthew I. Malabag

**Section**: BSIT- IT2C


A Java-based console enrollment system built with Object-Oriented
Programming principles. This system allows campus registrars to
manage students, courses, instructors, sections, departments,
and tuition fees.

---

Here's the full README with simple bullet format:

markdown# OOP Enrollment System

A Java-based console enrollment system built with Object-Oriented
Programming principles. This system allows campus registrars to
manage students, courses, instructors, sections, departments,
and tuition fees.

---

## Features

- Add, update, remove, and view Students
- Add, update, remove, and view Courses
- Add, update, remove, and view Instructors
- Add, update, remove, and view Sections
- Add, update, remove, and view Departments
- Assign Instructors to Sections
- Enroll Students in Sections with capacity validation
- View Department Hierarchy (Department -> Sections -> Students)
- Calculate tuition fee per unit and process payments
- Apply scholarship discounts (Full, Partial, Academic)
- Duplicate ID prevention for all entities
- Input validation using Try-Catch blocks

---

## Step by Step Guide

### 1. Student Management
Manage all student records in the system.

- **Add Student** - Enter Student ID, Name, and Program
- **Update Student** - Enter Student ID and new information
- **Remove Student** - Enter Student ID to remove
- **View All Students** - Displays all registered students
- **Find Student** - Search by ID or Name
- **View Tuition Status** - Shows tuition status of all students

**Example:**
Enter Student ID: 1001
Enter Name: Juan Dela Cruz
Enter Program: BSIT
Student Saved Successfully

---

### 2. Course Management
Manage all course records in the system.

- **Add Course** - Enter Course ID, Name, and Program
- **Update Course** - Enter Course ID and new information
- **Remove Course** - Enter Course ID to remove
- **View All Courses** - Displays all registered courses

**Example:**
Enter Course ID: C01
Enter Course Name: Programming 1
Enter Program: BSIT
Course Saved Successfully

---

### 3. Instructor Management
Manage all instructor records and section assignments.

- **Add Instructor** - Enter Instructor ID, Name, and Course handled
- **Update Instructor** - Enter Instructor ID and new information
- **Remove Instructor** - Enter Instructor ID to remove
- **View All Instructors** - Displays all registered instructors
- **View Instructor Details** - Shows full details of a specific instructor
- **Assign to Section** - Assign an instructor to a section

**Example:**
Enter Instructor ID: 201
Enter Name: Mr. Santos
Enter Course: Programming 1
Instructor Saved Successfully

---

### 4. Department Management
Manage all department records and view hierarchy.

- **Add Department** - Enter Department ID and Name
- **Update Department** - Enter Department ID and new name
- **Remove Department** - Enter Department ID to remove
- **View All Departments** - Displays all departments
- **View with Sections** - Shows departments with their sections

**Example Output - View with Sections:**
====== ALL DEPARTMENTS AND SECTIONS ======
Department  : College of Computer Studies | ID: D01
Section ID : BSIT-1A
Course     : Programming 1
Capacity   : 25/30
Section ID : BSIT-1B
Course     : Programming 1
Capacity   : 30/30

---

### 5. Section Management
Manage all sections and enroll students.

- **Add Section** - Enter Section ID, Course, Instructor, and Max Capacity
- **Update Section** - Enter Section ID and new information
- **Remove Section** - Enter Section ID to remove
- **View All Sections** - Shows all sections with instructor and students
- **Enroll Student** - Enroll a student in a section
- **Find Section** - Search section by ID

**Example - Enrolling a Student:**
Enter Student ID: 1001
Enter Section ID: BSIT-1A
Student Juan Dela Cruz enrolled in BSIT-1A

**If section is already full:**
ERROR: Enrollment failed: Section BSIT-1A is full. (Max: 30)

---

### 6. Tuition and Payment
Manage tuition fees and payments per student.

- **Calculate Fee** - Calculates tuition based on number of units
- **Make Payment** - Process a payment for a student
- **View Balance** - Check remaining balance of a student
- **Apply Scholarship** - Apply scholarship discount
- **View All Status** - Shows tuition status of all students

**Tuition Rate:** PHP 1,000.00 per unit

**Scholarship Types:**
- **full** - 100% off
- **partial** - 50% off
- **academic** - 25% off

**Example - Calculate Fee:**
Enter Student ID: 1001
Enter Number of Units: 6
Enter Discount Rate (0 if none): 0
Student  : Juan Dela Cruz
Total Fee: 6000.0

**Example - Make Payment:**
Enter Student ID: 1001
Current Balance: 6000.0
Enter Payment Amount: 3000.0
Remaining Balance: 3000.0
Status: PENDING

**Example - Fully Paid:**
Remaining Balance: 0.0
Status: FULLY PAID

---

## Recommended Order of Use
Step 1 - Add Courses
Step 2 - Add Instructors
Step 3 - Add Departments
Step 4 - Add Sections (assign Course and Instructor)
Step 5 - Add Students
Step 6 - Assign Instructor to Section
Step 7 - Enroll Students in Sections
Step 8 - Calculate Tuition and Process Payments

---

## Validation and Error Handling

- Duplicate IDs are automatically rejected
- Payments cannot be negative or exceed remaining balance
- Sections cannot exceed maximum capacity
- Invalid inputs are caught using Try-Catch blocks
  preventing the system from crashing

---

## Data Storage

All data is stored in-memory using Java ArrayLists.
Data resets when the program is restarted.
No database or file storage is used.

---
