# Defect Report

**Title:** Product image links redirect to base inventory page instead of individual product detail page.

---

**Steps to Reproduce:**
1. Go to https://www.saucedemo.com
2. Login using valid credentials:
   - Username: `standard_user`
   - Password: `secret_sauce`
3. On the Inventory page, click on the product image for "Sauce Labs Backpack"

---

**Expected Result:**
User should be redirected to a **product detail page** with additional product info and option to add to cart.

---

**Actual Result:**
Clicking the product image redirects the user back to the same **inventory page** with no additional product details shown.

---

**Screenshot:**  
*(Include a screenshot if available. In a real report, use `driver.getScreenshotAs(...)` to capture.)*

---

**Severity:** Medium

---

**Notes:** This issue affects user experience as they cannot view detailed product information before purchasing.
