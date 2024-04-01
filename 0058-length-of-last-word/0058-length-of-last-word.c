int lengthOfLastWord(char* s) {
    int len;
    int i;

    i = 0;
    len = 0;
    while (s[i]){
        i++;
    }
    while (i > 0 && (s[i - 1] == '\t' || s[i - 1] == '\f' || s[i - 1] == ' ' || s[i - 1] == '\n' || s[i - 1] == '\r')) {
        i--;
    }
    while (i > 0 && !(s[i - 1] == '\t' || s[i - 1] == '\f' || s[i - 1] == ' ' || s[i - 1] == '\n' || s[i - 1] == '\r')) {
        len++;
        i--;
    }
    return len;

}