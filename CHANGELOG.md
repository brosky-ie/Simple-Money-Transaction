# CHANGELOG

All notable changes to this project will be documented in this file.

## v0.0.1
- Implemented basic banking menu with options:
  - Check balance
  - Withdraw funds (with input validation)
  - Deposit funds (with input validation)
  - Exit program
- Added error handling for invalid inputs (non-numeric, out of range, negative amounts)
- Maintains and updates user balance during session

## v0.0.2
- Added PIN verification for user login with 3 attempts before exit.  
- Implemented withdrawal limit of 3 times per session, displaying "Withdrawal limit reached" after max attempts.  
- Enforced minimum balance of 500; withdrawals that would reduce balance below 500 are rejected with a message.  
- Added validation to prevent withdrawals when balance is exactly 500.  
- Maintained all existing input validation and error handling  
- FIxed minor grammar error.  
