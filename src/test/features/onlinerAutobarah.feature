  #noinspection NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters,NonAsciiCharacters
  Feature: Open OnlinerBy
    As a user i want to open onliner and hover on Autob category.

    Scenario: Hovering Autobaraholka
      Given onlinerBy
      When i open onliner and hover over Autobaraholka link
      Then subcategories from Autobaraholka are adding to the list and comparing to the following list
        | Новые авто|    С пробегом|    Цена с НДС|    Авто до 4000 р.|    Авто до 10 000 р.|    Авто до 20 000 р.|Минск|Гомель|    Могилев|    Витебск|    Гродно|    Брест|    Audi|    BMW|    Citroen|    Ford|    Mazda|    Mercedes-Benz|    Nissan|    Opel|    Peugeot|    Renault|    Toyota|    Volkswagen|    Aprilia|    BMW|    Harley-Davidson|    Honda|    HORS|    Jawa|    Kawasaki|    Suzuki|    Viper|    Yamaha|    Днепр|    Минск |

    Scenario: Hovering Houses
      When i open onliner and hover over Houses link
      Then subcategories from Houses are adding to the list and comparing to the following houselist
        |Минск|Брест|Витебск|Гомель|Гродно|Могилев|1-комнатные|2-комнатные|3-комнатные|4+-комнатные|До 30 000 $|30 000–80 000 $|От 80 000 $|Минск|Брест|Витебск|Гомель|Гродно|Могилев|1-комнатные|2-комнатные|3-комнатные|4+-комнатные|Комнаты|От собственника|До 250 $|250-500 $|От 500 $|
      And closing browser