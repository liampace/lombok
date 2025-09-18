import lombok.AccessLevel;
import lombok.extern.slf4j.Slf4j;

@Slf4j(access = AccessLevel.PUBLIC)
class LoggerSlf4jAccessPublic {
}

@SuppressWarnings("deprecation")
@Slf4j(access = AccessLevel.MODULE)
class LoggerSlf4jAccessModule {
}

@Slf4j(access = AccessLevel.PROTECTED)
class LoggerSlf4jAccessProtected {
}

@Slf4j(access = AccessLevel.PACKAGE)
class LoggerSlf4jAccessPackage {
}

@Slf4j(access = AccessLevel.PRIVATE)
class LoggerSlf4jAccessPrivate {
}

@Slf4j(access = AccessLevel.NONE)
class LoggerSlf4jAccessNone {
}
