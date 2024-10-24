using System;
using System.Collections.Generic;
using System.Linq;

class Collections
{
    static Dictionary<string, List<string>> myDict = new Dictionary<string, List<string>>();

    static void Main()
    {
        bool keepRunning = true;

        while (keepRunning)
        {
            Console.WriteLine("\nChoose an option:");
            Console.WriteLine("a. Populate the Dictionary");
            Console.WriteLine("b. Display Dictionary Contents");
            Console.WriteLine("c. Remove a Key");
            Console.WriteLine("d. Add a New Key and Value");
            Console.WriteLine("e. Add a Value to an Existing Key");
            Console.WriteLine("f. Sort the Keys");
            Console.WriteLine("g. Exit");

            char choice = Console.ReadLine()[0];

            switch (choice)
            {
                case 'a':
                    PopulateDictionary();
                    break;
                case 'b':
                    DisplayDictionary();
                    break;
                case 'c':
                    RemoveKey();
                    break;
                case 'd':
                    AddNewKeyValue();
                    break;
                case 'e':
                    AddValueToExistingKey();
                    break;
                case 'f':
                    SortKeys();
                    break;
                case 'g':
                    keepRunning = false;
                    break;
                default:
                    Console.WriteLine("Invalid option. Please try again.");
                    break;
            }
        }
    }

    static void PopulateDictionary()
    {
        // Populate with some data. Modify as needed.
        myDict["Group1"] = new List<string> { "Value1", "Value2" };
        myDict["Group2"] = new List<string> { "Value3", "Value4" };
        Console.WriteLine("Dictionary populated.");
    }

    static void DisplayDictionary()
    {
        foreach (var kvp in myDict)
        {
            Console.WriteLine($"{kvp.Key}: {string.Join(", ", kvp.Value)}");
        }
    }

    static void RemoveKey()
    {
        Console.WriteLine("Enter the key to remove:");
        string key = Console.ReadLine();

        if (myDict.Remove(key))
        {
            Console.WriteLine($"Key '{key}' removed.");
        }
        else
        {
            Console.WriteLine($"Key '{key}' not found.");
        }
    }

    static void AddNewKeyValue()
    {
        Console.WriteLine("Enter the new key:");
        string key = Console.ReadLine();

        Console.WriteLine("Enter the value for the new key:");
        string value = Console.ReadLine();

        if (!myDict.ContainsKey(key))
        {
            myDict[key] = new List<string>();
        }
        myDict[key].Add(value);

        Console.WriteLine($"Added {value} to key '{key}'.");
    }

    static void AddValueToExistingKey()
    {
        Console.WriteLine("Enter the existing key:");
        string key = Console.ReadLine();

        if (myDict.ContainsKey(key))
        {
            Console.WriteLine("Enter the value to add:");
            string value = Console.ReadLine();
            myDict[key].Add(value);

            Console.WriteLine($"Added {value} to key '{key}'.");
        }
        else
        {
            Console.WriteLine($"Key '{key}' not found.");
        }
    }

    static void SortKeys()
    {
        var sortedDict = from entry in myDict orderby entry.Key ascending select entry;

        foreach (var kvp in sortedDict)
        {
            Console.WriteLine($"{kvp.Key}: {string.Join(", ", kvp.Value)}");
        }
    }
}
