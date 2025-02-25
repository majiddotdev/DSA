package StringDSA;

import java.util.*;

public interface FindDuplicateCharactersInAString {
        public static void main(String[] args) {
            String str = "programming";

            Set<String> seen = new HashSet<>();
            Set<String> duplicates = new LinkedHashSet<>();

            Arrays.stream(str.split("")).forEach(e -> {
                if (!seen.add(e)) {
                    duplicates.add(e);
                }
            });
            System.out.println(duplicates);

        }
    }


