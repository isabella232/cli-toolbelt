package com.simplifyops.toolbelt;

/**
 * Format object using tostring
 */
public class ToStringFormatter implements OutputFormatter {
    @Override
    public String format(final Object o) {
        return o != null ? o.toString() : null;
    }
}
