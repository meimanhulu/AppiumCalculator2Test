Feature: Calculator Realme

  Scenario: Hitung Penjumlahan Sederhana
    Given saya menekan tombol clear
    And saya menekan tombol nilai pertama
    And saya menekan tombol plus
    And saya menekan tombol nilai kedua
    And saya menekan tombol sama dengan
    Then saya mendapatkan hasil "14"
