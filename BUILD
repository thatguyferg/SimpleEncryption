java_library(
    name = "CaesarCipher",
    srcs = glob(["src/main/java/org/thatguyferg/*.java"]),
    deps = ["@com_google_guava_guava//jar"],
)

java_test(
  name = "tests",
  srcs = glob(["src/test/java/**/*.java"]),
  test_class = "org.thatguyferg.AllTests",
  deps = [
      "@org_assertj_core//jar",
       ":CaesarCipher",

  ]
)
