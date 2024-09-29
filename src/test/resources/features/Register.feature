Feature: Sign up
  Sebagai Pengguna Saya ingin Register akun

  Scenario: Sebagai Pengguna Saya ingin Register akun
    Given Pengguna berada di landing page
    When Pengguna klik Sign Up
    And Pengguna Input Username
    And Pengguna Input Password
    And Pengguna klik button Sign Up
    Then Pengguna berhasil Sign Up