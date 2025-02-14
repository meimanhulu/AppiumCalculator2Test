Feature: Calculator Realme

  Scenario: Hitung Penjumlahan Sederhana
    Given saya menekan tombol clear
    And saya menekan tombol pertama "<firstValue>"
    And saya menekan tombol plus
    And saya menekan tombol kedua "<secondValue>"
    And saya menekan tombol sama dengan
    Then saya mendapatkan hasil "<result>"

#    Outline scenario
    Examples:
      | firstValue | secondValue | result |
      | 5          | 9           | 14     |
      | 4          | 6           | 10     |
      | 10         | 20          | 30     |
      | 200        | 30          | 230    |
