package javaalgorithms.Algorithms;

public class StringManipulation {
    
    public static int CountVowels(String sampleString)
    {
        int vowelCount = 0;

        if (!sampleString.isEmpty())
        {
            var vowels = new char[]
            {
                'a', 'e', 'i', 'o', 'u'
            };
            String lowerCaseString = sampleString.toLowerCase();
            char[] characters = lowerCaseString.toCharArray();
            var j = (characters.length / 2) + 1;
            for (int i = characters.length / 2; i >= 0; i--)
            {
                for(char vowel: vowels)
                {
                    if (j < characters.length && vowel == characters[j])
                    {
                        vowelCount += 1;
                    }
                    if (vowel == characters[i])
                    {
                        vowelCount += 1;
                    }
                }
                j++;
            }
        }
        return vowelCount;
    }

}
