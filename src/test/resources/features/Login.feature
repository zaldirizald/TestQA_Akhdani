Feature: Login
  Sebagai Pengguna Saya ingin Login akun
@1
  Scenario: Sebagai Pengguna Saya ingin Login akun
    Given Pengguna berada di landingpage
    When Pengguna klik Login
    And Pengguna Input Username valid
    And Pengguna Input Password valid
    And Pengguna klik button Login
    Then Pengguna berhasil login

