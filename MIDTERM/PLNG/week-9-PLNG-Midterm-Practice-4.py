import math
from datetime import datetime


def main():
  name = input("Enter your Name: \n")
  print(f"\nWELCOME {name.upper()}")

  while True:
    try:
      # Get total pages
      while True:
        page_input = input("\nHow many pages does the book have? \n")
        try:
          page = int(page_input)
          if page < 0:
            print("[Error] Negative numbers are not allowed.")
            continue
          if page == 0:
            print("[Error] A book must have at least 1 page.")
            continue
          break
        except ValueError:
          print(
              "[Error] Decimals and letters are not allowed. Please enter a"
              " whole number."
          )

      # Get read pages
      while True:
        read_input = input("\nHow many pages have you read? \n")
        try:
          read = int(read_input)
          if read < 0:
            print("[Error] Negative numbers are not allowed.")
            continue
          if read > page:
            print(
                f"[Error] You cannot read more pages than the book actually"
                f" has ({page})."
            )
            continue
          break
        except ValueError:
          print(
              "[Error] Decimals and letters are not allowed. Please enter a"
              " whole number."
          )

      # Get issue date
      while True:
        issue_input = input(
            "\nIssue date (Format: MM DD, YY, e.g., 08 1, 21): \n"
        )
        try:
          # Format "MM d, yy" matches strptime "%m %d, %y"
          issue_date = datetime.strptime(issue_input, "%m %d, %y").date()
          break
        except ValueError:
          print(
              "\n[Error] Invalid date format typed. Please write it exactly"
              " like: 08 1, 21"
          )

      # Get due date
      while True:
        due_input = input("\nDue Date (Format: MM DD, YY, e.g., 08 15, 21): \n")
        try:
          due_date = datetime.strptime(due_input, "%m %d, %y").date()
          break
        except ValueError:
          print(
              "\n[Error] Invalid date format typed. Please write it exactly"
              " like: 08 1, 21"
          )

      # Calculations
      percent = (read / page) * 100
      print(f"\nYou have read {percent:.0f}% of the book.")

      delta = due_date - issue_date
      days = delta.days

      if days < 0:
        overdue_days = abs(days)
        print(
            f"The book is overdue by {overdue_days} day(s) and you have to"
            " return the book."
        )
      else:
        print(f"You have {days} days remaining to return the book.")

      pages_left = page - read
      left_per_day = 0
      if days > 0:
        left_per_day = math.ceil(pages_left / days)

      print(
          f"You still have {pages_left} page(s) left and you should read"
          f" {left_per_day} pages a day."
      )

    except Exception:
      print("\n[Error] An unexpected calculation or input error occurred.")

    choice = input("\nDo you want to continue? (YES/NO): ").strip().upper()
    if choice not in ["YES", "Y"]:
      break

  print("\nThank you for using the Library System! Goodbye.")


if __name__ == "__main__":
  main()
