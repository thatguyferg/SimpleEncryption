java_library(
    name = "CaesarCipher",
    srcs = glob(["src/main/java/org/thatguyferg/*.java"]),
)

java_test(
  name = "tests",
  srcs = glob(["src/test/java/**/*.java"]),
  test_class = "org.thatguyferg.AllTests",
  deps = [
       ":CaesarCipher",

  ]
)
