Feature: Ceckout
  Sebagai Pengguna Saya ingin Checkout product
@2
  Scenario: Sebagai Pengguna Saya ingin checkout product
    Given Pengguna berada di landingPage
    When Pengguna klik product
    And Pengguna klik add to cart
    And Pengguna klik cart
    And Pengguna klik place order
    And Pengguna Input Form
    And Pengguna Klik Purchase
    Then Pengguna berhasil purchase product
    And Klik ok
