import lombok.AccessLevel;
import lombok.extern.flogger.Flogger;

@Flogger(access = AccessLevel.PUBLIC)
class LoggerFloggerAccessPublic {
}

@Flogger(access = AccessLevel.MODULE)
class LoggerFloggerAccessModule {
}

@Flogger(access = AccessLevel.PROTECTED)
class LoggerFloggerAccessProtected {
}

@Flogger(access = AccessLevel.PACKAGE)
class LoggerFloggerAccessPackage {
}

@Flogger(access = AccessLevel.PRIVATE)
class LoggerFloggerAccessPrivate {
}

@Flogger(access = AccessLevel.NONE)
class LoggerFloggerAccessNone {
}
