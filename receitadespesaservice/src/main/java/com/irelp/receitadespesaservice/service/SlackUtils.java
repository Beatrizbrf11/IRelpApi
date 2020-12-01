package com.irelp.receitadespesaservice.service;

abstract class SlackUtils {

    /**
     * Indica se determinada string eh nula ou vazia.
     *
     * @param string String a ser analisada.
     * @return Se a string nao esta vazia.
     */
    static boolean isNotEmtpy(final String string) {
        if (string == null) {
            return false;
        }
        return string.trim().length() != 0;
    }
}
