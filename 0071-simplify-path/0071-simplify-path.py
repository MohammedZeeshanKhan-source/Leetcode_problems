class Solution(object):
    def simplifyPath(self, path):
        st = []
        parts = path.split("/")

        for part in parts:

            if part == "" or part == ".":
                continue

            if part == ".." and len(st) == 0:
                continue

            if part == ".." and len(st) > 0:
                st.pop()

            else:
                st.append(part)

        if len(st) == 0:
            return "/"

        result = ""

        while st:
            result += "/" + st.pop(0)

        return result